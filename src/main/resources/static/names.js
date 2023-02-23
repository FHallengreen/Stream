const names = ["peter","jan","john","janne","celine"]

const capitalized = names.map(name => name.charAt(0).toUpperCase() + name.slice(1))
    .sort()
    .filter(name => name.startsWith("J"))

console.log(capitalized.join(","))

const lis = capitalized.map(name => "<li>"+name+"</li>")
const listAsString = lis.join("")

document.getElementById("my-ul").innerHTML = listAsString

