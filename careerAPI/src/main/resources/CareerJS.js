function addCareer(e){
    e.preventDefault();
    let careerList = {
        id: document.getElementById("id").value,
        jobTitle: document.getElementById("jobTitle").value,
        jobDescription: document.getElementById("jobDescription").value,
        salary: document.getElementById("salary").value
    }
    fetch("http://localhost:8080/Career",
        {
            method: 'POST',
            headers: {'Content-Type': 'application/json',},
            body: JSON.stringify(careerList),
        }
    ).then(()=>window.location.reload(true))
}
function deleteAllCareer(){
    //e.preventDefault();
    fetch("http://localhost:8080/Careers",
        {
            method: 'DELETE',
            headers: {'Content-Type': 'application/json',},
        }
    ).then(()=>window.location.reload(true))
}
 async function deleteCareer(id) {
     //let response = await fetch('http://localhost:8080/Careers/${id}', {method: 'DELETE', headers: {'Content-Type': 'application/json',},});
    //fetch('http://localhost:8080/Careers/${id}', {method: 'DELETE', headers: {'Content-Type': 'application/json',},});
//     if (response.ok) {
//
//         alert('Career has been deleted successfully!');
//         allCareers();
//     } else {
//         alert('HTTP-Error: " + response.status');
//     }
 var idNum = document.getElementById("id").value
   // var bookTitle = document.getElementById("title").value
        fetch("http://localhost:8080/Careers/" + idNum,
        {
            method: 'DELETE',
            headers: {'Content-Type': 'application/json',},
        }
    ).then(()=>window.location.reload(true))
 }
async function updateCareer(id, productForm){
    let response = await fetch(`http://localhost:8080/Careers/${id}`,
        { method: 'PUT',
            headers: { 'Content-Type': 'application/json' },
            body: JSON.stringify({ ...Object.fromEntries(new FormData(productForm)),
                productId: id })
        });
    if(response.ok){
        alert('Career has been updated successfully!');
        allCareers();
        window.location.href = window.location.href.split('?')[0];
    } else { alert("HTTP-Error: " + response.status);
    } }

 async function searchCareers(id) {
//     let response = await fetch('http://localhost:8080/Careers/${id}');
//     if (response.ok) {
//         return await response.json();
//     } else {
//         alert("HTTP-Error: " + response.status);
//         return null;
//     }
var idNum = document.getElementById("id").value
   // var bookTitle = document.getElementById("title").value
        fetch("http://localhost:8080/Careers/" + idNum,
        {
            method: 'GET',
            headers: {'Content-Type': 'application/json',},
        }
    ).then(()=>window.location.reload(true))
 };
async function allCareers(){
    let response = await fetch("http://localhost:8080/Careers");
    let body = await response.json();
    let careerList = body.map(careerList => {
        return (
            `<li class="list-group-item careerList">
            <p>${careerList.id}</p>
                <p>${careerList.jobTitle}</p>
                <p>${careerList.jobDescription}</p>
                <p>$${careerList.salary}</p>
            </li>`
        );
    }).join("");
    document.getElementById("careerList").innerHTML = careerList;
}
allCareers();
//if(searchCareers(idNum)){
//    fetch("http://localhost:8080/Careers/" + idNum)
//}
//allCareers();