var app = (function(){
    return {
        getCars: function(){
            console.log("Hola");
            fetch('carros')
              .then(response => response.json())
              .then(data => app.tabla(data))
              .catch(error => console.error(error));
        },
        getById: function(id){
            fetch('carros/' + id)
              .then(response => response.json())
              .then(data => console.log(data))
              .catch(error => console.error(error));
        },

        saveCars: function(){
             var color = document.getElementById('color-input').value;
             var marca = document.getElementById('marca-input').value;
             var costo = document.getElementById('precio-input').value;

             fetch('carros', {
               method: 'POST',
               headers: {
                 'Content-Type': 'application/json'
               },
               body: JSON.stringify({color: color, marca: marca, costo: costo})
             })
             .then(response => response.json())
             .then(data => {
                 console.log(data);
                 app.getCars(); // Actualizar tabla después de agregar el carro
             })
             .catch(error => console.error(error));

             // Limpiamos los campos del formulario
             document.getElementById('color-input').value = '';
             document.getElementById('marca-input').value = '';
             document.getElementById('precio-input').value = '';
        },

        tabla: function(json){
            var table = document.getElementById('tabla-carros');
            while (table.rows.length > 1) {
              table.deleteRow(1);
            }
            for (var i = 0; i < json.length; i++) {
                  var row = table.insertRow(i + 1);
                  var color = row.insertCell(0);
                  var marca = row.insertCell(1);
                  var costo = row.insertCell(2);
                  var id = row.insertCell(3);

                  color.innerHTML = json[i].color;
                  marca.innerHTML = json[i].marca;
                  costo.innerHTML = json[i].costo;
                  id.innerHTML = json[i].id;
            }
        },



    };
})();



