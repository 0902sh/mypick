var fs = require("fs");
const RED = "\033[91m";
const END = "\033[0m";

// 1. Sync
var data = fs.readFileSync("01_main.js");
console.log(data.toString());
console.log("File Read OK 1");

// 2. Callback
fs.readFile("01_main.js", function(err, data){
    if(err) return console.error(err);
    console.log(data.toString());
});
console.log(RED + "File Read OK 2" + END);
