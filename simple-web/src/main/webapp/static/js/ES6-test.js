function stringTemplate() {
    let name = "aaa";
    let html = `<p>My name:${name}</p>`;
    console.log(html);
    var x = 1;
    var y = 2;

    // `${x} + ${y} = ${x + y}`// "1 + 2 = 3"
    // `${x} + ${y * 2} = ${x + y * 2}`;//"1 + 4 = 5"

    var obj = {x: 1, y: 2};     //`${obj.x + obj.y}`;// 3
}

//模板字符串嵌套
const tmpl = addrs => `<table>${addrs.map(
    addr => `<tr><td>${addr.first}</td></tr> 
             <tr><td>${addr.last}</td></tr>`
)}</table>`;

const tmplData =  [
    { first: '<Jane>', last: 'Bond' },
    { first: 'Lars', last: '<Croft>' },
];
console.log(tmpl(tmplData));

export class Person {
    //noinspection JSAnnotator
    set name(name) {
        console.log("set person name:" + name);
    }

    get name() {
        console.log("get person name:" + name);
    }
}

let person = new Person();
person.name = 'aaa';
person.name;