/*
 * Node.js : Streams API : Example 1
 */
var fs = require('fs');
var rstream = fs.createReadStream('sample.txt');
var wstream = fs.createWriteStream('duplicate.txt');

var dataLength = 0;
// listen on a readStream and find the data length
rstream
    .on('data', function (chunk) {
        dataLength += chunk.length;
    })
    .on('end', function () {  // done
        console.log('The length was:', dataLength);
    });

// write to another file
rstream.pipe(wstream);
// write to console
rstream.pipe(process.stdout);
