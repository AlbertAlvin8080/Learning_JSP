"use strict";

function showMessage(message, type) {
    const messageContainer = document.getElementById('messageContainer');
    messageContainer.innerHTML = message;
    messageContainer.style.display = 'block';
    messageContainer.style.opacity = 1;

    switch (type) {
        case "INFO":
            messageContainer.classList.add("info");
            break;
        case "ERROR":
            messageContainer.classList.add("error");
            break;
        default:
            messageContainer.classList.add("info");
    }

    setTimeout(function () {
        setInterval(() => {
            let opacity = parseFloat(messageContainer.style.opacity) - 0.1;
            messageContainer.style.opacity = opacity.toString();
        }, 10);
        setTimeout(() => messageContainer.style.display = 'none', 110)
    }, 2500);
}