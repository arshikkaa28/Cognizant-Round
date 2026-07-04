function showEvent(name = "Community Event") {
    console.log(name);
}

showEvent();

const event = {
    eventName: "Music Fest",
    date: "15 July"
};

const { eventName, date } = event;

console.log(eventName);
console.log(date);


const events = ["Music", "Dance"];

const copiedEvents = [...events];

console.log(copiedEvents);