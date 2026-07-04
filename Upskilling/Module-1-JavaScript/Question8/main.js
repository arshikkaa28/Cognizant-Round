document.getElementById("registerBtn").onclick = function () {
    alert("Registration Successful");
};

document.getElementById("category").onchange = function () {
    console.log("Selected Category: " + this.value);
};

document.getElementById("search").addEventListener("keydown", function (event) {
    console.log("Key Pressed: " + event.key);
});