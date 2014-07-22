/*
 * currying example : setting up a dynamic function
 * based on input 'a', the respective function is returned
 */
var curryedFn = function (a) {
    return function (b) {
        return a + " and " + b + " are best friends !!!!!!";
    };
};

var showFriends = curryedFn("shiva");
console.log(showFriends("kapil"));

var showFriends = curryedFn("chandra");
console.log(showFriends("shiva"));

var showFriends = curryedFn("santosh");
console.log(showFriends("chandra"));
