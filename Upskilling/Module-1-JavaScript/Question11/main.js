document.getElementById("registrationForm").addEventListener("submit", function(event){

event.preventDefault();

let name=this.elements.name.value;

let email=this.elements.email.value;

let selectedEvent=this.elements.event.value;

if(name==="" || email===""){

alert("Please fill all fields");

return;

}

console.log(name,email,selectedEvent);

});