const container = document.querySelector("#eventContainer");

eventsArray.forEach(event => {

    const card = document.createElement("div");

    card.innerHTML = `
        <h3>${event.name}</h3>
        <p>${event.category}</p>
    `;

    container.appendChild(card);

});