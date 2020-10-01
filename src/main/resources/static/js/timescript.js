var today = new Date();
var time = ("0" + today.getHours()).slice(-2) + ":" + ("0" + today.getMinutes()).slice(-2);
$("#time").text(`${time}`)
tody = null;
setInterval(() => {
    var today = new Date();
    var time = ("0" + today.getHours()).slice(-2) + ":" + ("0" + today.getMinutes()).slice(-2);
    $("#time").text(`${time}`)
    tody = null;
}, 1000);