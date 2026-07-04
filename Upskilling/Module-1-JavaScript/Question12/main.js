function register(){

fetch("https://jsonplaceholder.typicode.com/posts",{

method:"POST",

headers:{
"Content-Type":"application/json"
},

body:JSON.stringify({

name:"Arshika",

email:"arshika@gmail.com"

})

})

.then(response=>response.json())

.then(data=>{

setTimeout(()=>{

alert("Registration Successful");

},2000);

})

.catch(()=>{

alert("Registration Failed");

});

}