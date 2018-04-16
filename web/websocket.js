var ws = new WebSocket("ws://localhost:8080/DeviceWebApp/device");

ws.onmessage = function(event) {
        var deviceStatus = document.getElementById("deviceStatus");
        var message = JSON.parse(event.data);
        deviceStatus.innerHTML = message.deviceState;
    };


function toggle() {
    var status = document.getElementById("deviceStatus").innerHTML.trim();
    var newStatus;
    
    if (status === 'ON'){
        newStatus = "OFF";
    }
    else{
        newStatus = 'ON';
    }
    
    var json = JSON.stringify({
        "deviceState":newStatus
    });

    ws.send(json);
}


