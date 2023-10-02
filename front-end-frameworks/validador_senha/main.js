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

  let l1 = document.getElementById("l1");
  let l2 = document.getElementById("l2");
  let l3 = document.getElementById("l3");
  let l4 = document.getElementById("l4");

  if(input.value.length >= 8){
    l1.className = "ok"
  }else {
    l1.className ="deniss"
  }

  if(input.value.length >= 8){
    l1.className = "ok"
  }else {
    l1.className ="deniss"
    }
}