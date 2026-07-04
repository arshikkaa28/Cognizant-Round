const eventsArray = [];

eventsArray.push({
    name: "Music Fest",
    category: "Music"
});

eventsArray.push({
    name: "Workshop",
    category: "Education"
});

const musicEvents = eventsArray.filter(
    e => e.category === "Music"
);

console.log(musicEvents);

const cards = eventsArray.map(
    e => `Workshop on ${e.name}`
);

console.log(cards);