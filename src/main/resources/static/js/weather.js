$(() =>{
    setWeather();
    refreshWeather();

})


function setWeather() {
    $.get("https://ch.wetter.com/schweiz/basel/CH0CH0260.html", (data) => {
        var doc = document.createElement('html');
        doc.innerHTML = data;
        $("#wetter").text($("#rtw_temp",doc).text())
    });

}

function refreshWeather() {

    setInterval(() => {
        setWeather();
    }, 1000*60*2);
}

