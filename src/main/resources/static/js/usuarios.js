// Call the dataTables jQuery plugin
$(document).ready(function () {

  cargarUsuarios()
  $('#usuarios').DataTable();
});


async function cargarUsuarios() {
  const request = await fetch('/listar', {
    method: 'GET',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    },

  });
  const usuarios = await request.json();

  let listadoHtml = ''

  for (let usuario of usuarios) {
    let usuarioHTML = `
      <tr>
        <td>${usuario.id}</td>
        <td>${usuario.nombre + " " +  usuario.apellido}</td>
        <td>${usuario.email}</td>
        <td>${usuario.telefono}</td>
        <td class="text-center"><a href="#" class="btn btn-primary btn-icon-split">
            <span class="icon text-white-50">
                <i class="fas fa-trash"></i>
            </span>
            <span class="text">Editar Usuario</span>
        </a></td>
        <td class="text-center"><a href="#" class="btn btn-danger btn-icon-split">
            <span class="icon text-white-50">
                <i class="fas fa-trash"></i>
            </span>
            <span class="text">Eliminar Usuario</span>
        </a></td>
      </tr>
    `;

    listadoHtml += usuarioHTML;
  }

  document.querySelector('#usuarios tbody').outerHTML = listadoHtml;

}