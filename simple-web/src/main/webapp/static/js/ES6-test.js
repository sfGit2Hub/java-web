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