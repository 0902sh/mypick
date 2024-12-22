var http = require("http");

// HttpRequest Option
var options = {
    host: 'localhost',
    port: '10002',
    path: '/index.html'
};

// Callback Function
var callback = function(res){
    var content = '';
    res.on('data', function(data){
        content += data;
    });

    res.on('end', function(){
        // display data
        console.log("Data Received");
        console.log(content);
    });
}

for(let i=0; i<5; i++){
    var request = http.request(options, callback);
    request.end();
}    