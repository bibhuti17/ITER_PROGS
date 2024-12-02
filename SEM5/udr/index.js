const items = [
    "1 lb Salmon",
    "1 cup Pine Nuts",
    "2 cups Butter Lettuce",
    "1 Yellow Squash",
    "1/2 cup Olive Oil",
    "3 cloves of Garlic"
]

const ingredients = React.createElement(
    "ul",
    { className: "ingredients" },
    items.map((ingredient, i) =>
        React.createElement("li", { key: i }, ingredient)
    )
)

ReactDOM.render(
    ingredients,
    document.getElementById('react-container')
)

console.log('ingredients', ingredients)