import SingleCounterInstance from "./singleton";
let test=new SingleCounterInstance( ).getInstance();
console.log(test.increment());