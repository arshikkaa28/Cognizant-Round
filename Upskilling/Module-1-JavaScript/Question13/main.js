function submitForm(){

let name="Arshika";

console.log("Form Submitted");

console.log(name);

debugger;

fetch("https://jsonplaceholder.typicode.com/posts")

.then(response=>response.json())

.then(data=>{

console.log(data);

});

}