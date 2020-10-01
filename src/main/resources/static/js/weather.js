$(() =>{
    setWeather();
    refreshWeather();

})


function setWeather() {
    $.get("https://ch.wetter.com/schweiz/basel/CH0CH0260.html", (data) => {
        json = html2json(data);
        json = json.child;
        grad = json[1].child[3].child[23].child[3].child[1].child[17].child[13].child[1].child[1].child[1].child[1].child[3].child[5].child[3].child[1].child[0].text;
        console.log(grad);
        $("#wetter").text(grad)
    });

}

function refreshWeather() {

    setInterval(() => {
        setWeather();
    }, 1000);
}

