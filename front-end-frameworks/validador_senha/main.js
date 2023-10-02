function revelar() {
  let input = document.getElementById("senha");

  if (input.type == 'password') {
       input.type = "text"
  }else{
       input.type = 'password'
      }
  }

function validar(){
  let input = document.querySelector("#senha");
  let value = input.value
  let valueSplited = value.split("");

  let l1 = document.getElementById("l1");
  let l2 = document.getElementById("l2");
  let l3 = document.getElementById("l3");
  let l4 = document.getElementById("l4");

  if(input.value.length >= 8){
    l1.className = "ok"
  }else {
    l1.className ="deniss"
  }

  var findLowCase = false;
  var findNumber = false;
  var findEspecial = false;
  valueSplited.forEach(e => {
    let asciiCode = e.charCodeAt();

    if( asciiCode >= 97 &&  asciiCode <= 122){
      findLowCase = true;
    }
    if(asciiCode >=48 && asciiCode <= 57){
      findNumber = true;
    }
    if(
      (asciiCode >= 97 &&  asciiCode <= 122) != true &&
      (asciiCode >= 48 && asciiCode <= 57) != true &&
      (asciiCode >= 65 && asciiCode <= 90) != true
    ){
      findEspecial = true;
      console.log("FIND ESPECIALLLLL!!!");
    }
    });

  if(findLowCase){
    l2.className = "ok";
  }else{
    l2.className ="deniss"
  }

  if(findNumber){
    l3.className = "ok";
  }else{
    l3.className ="deniss"
  }

  if(findEspecial){
    l4.className = "ok";
  }else{
    l4.className = "deniss";
  }
}