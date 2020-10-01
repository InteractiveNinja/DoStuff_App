$(() =>{

    setTime();
    refreshTime();

})

function setTime() {
    today = new Date();
    time = ("0" + today.getHours()).slice(-2) + ":" + ("0" + today.getMinutes()).slice(-2);
    $("#time").text(`${time}`)
    tody = null;

}

function refreshTime() {
    setInterval(() => {
        today = new Date();
        time = ("0" + today.getHours()).slice(-2) + ":" + ("0" + today.getMinutes()).slice(-2);
        $("#time").text(`${time}`)
        tody = null;
    }, 1000);

}
