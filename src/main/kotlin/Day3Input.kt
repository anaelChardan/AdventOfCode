fun exampleDay3Input(): List<String> {
    return listOf(
        "..##.........##.........##.........##.........##.........##.......",
        "#...#...#..#...#...#..#...#...#..#...#...#..#...#...#..#...#...#..",
        ".#....#..#..#....#..#..#....#..#..#....#..#..#....#..#..#....#..#.",
        "..#.#...#.#..#.#...#.#..#.#...#.#..#.#...#.#..#.#...#.#..#.#...#.#",
        ".#...##..#..#...##..#..#...##..#..#...##..#..#...##..#..#...##..#.",
        "..#.##.......#.##.......#.##.......#.##.......#.##.......#.##.....",
        ".#.#.#....#.#.#.#....#.#.#.#....#.#.#.#....#.#.#.#....#.#.#.#....#",
        ".#........#.#........#.#........#.#........#.#........#.#........#",
        "#.##...#...#.##...#...#.##...#...#.##...#...#.##...#...#.##...#...",
        "#...##....##...##....##...##....##...##....##...##....##...##....#",
        ".#..#...#.#.#..#...#.#.#..#...#.#.#..#...#.#.#..#...#.#.#..#...#.#"
    )
}

fun day3Input(): List<String> = listOf(
"....#..#.................#..#..",
"#..#.#.#..#.###.#..#...#..#....",
".#....#......#.#.#..##...#...#.",
".............#.#..#........#.#.",
"............##.#..#...##.###...",
".....#..#......#......##.......",
"........##........#...........#",
"..................#..#.........",
"......#..#...#..#......###..#..",
".#....#...........#.....#.##...",
"..#..#.#........###..#....#...#",
"..#..##..#..#....#..#......#...",
"......#....................#...",
".........#..#..................",
"..#.#.....#......#.#....#...#..",
"..#..........##.......##.##....",
"#.......#.##.....#...#....#....",
"####..............###.#....#...",
"....#........#.#..###..#...#..#",
"#.#......#...#.##....#.....#...",
".......#......#.....#........#.",
".##.........#...#.........#....",
"............#....#.#........#..",
"#..##..#....#...#.#....#....#..",
".....#....##..#................",
".#...........#....#..#.....#...",
"......#.#...#..###.............",
"#...#...........#..###.#..#..#.",
"...................#..#....#..#",
"....#...#...#.#.....#....#.##..",
".......#.......#.#.........#...",
"#..#.......#...#..#.#......#...",
"..##...........#....#..#.......",
".#...............#...##........",
".....#..........#............#.",
"..#.......#.#.#...........#..#.",
"........#..#.#.#........#.#.##.",
".###..............#.#..........",
".#....###.....#......#....#....",
"............#.#......#..#....#.",
".#.#.............#........##...",
".....#..###....##.....#....#..#",
".##....#...#.#.........#......#",
"....##.......#...............##",
"..........##.##.......#........",
"......#....##.........##.#.#.#.",
"..............#....#..#......#.",
"......##.........#.........#...",
".#...##...##....##..#..#.....#.",
".#......#.###.#....#...#......#",
".##.......................#..#.",
"....#......#.##..........#.###.",
".#.....##..........#.#.........",
"....#.#.........#...#..........",
".#..##.#....##.......#.......#.",
".........#.......#............#",
"###..........#.....##.#....#...",
".......###.#....#........#...##",
"..#..#....#.......#.#..........",
".#..#..........#......#...#....",
".....###.#..#.....#...#..#.....",
"........#.#.#..........#.#..#..",
"........#...##.................",
"...#.............#.#..#......##",
"......#......##......#...#.#..#",
".#..#...##..........#...##.....",
"..#.#....####..#...#....##....#",
".#..##.........#..##......#....",
"#....#.#.........#.............",
"....###..............#....#....",
"....#..#..#...###..#.#..#.#....",
"....#.....#...........###..#...",
"....#.#.....#...#.....#.......#",
"..#.......#..................#.",
"#...................##.........",
"....#.#.#.#.#.....#.....#......",
"...............##..#..##.#...##",
"..#.....#.....##.........#..#..",
"...#...#.....#..##..##....#..##",
"..#.................#....#...#.",
"#....##...............##..#....",
"..#.....#.....##.........##...#",
"..#.###..............#...#.....",
".......................#.......",
"#...#..#.....##...#...#........",
"..........#......#.###....#...#",
"..#.....#.##.#..#.#.......#....",
"#.##...#............#..........",
"#........#.#.#..#...#..#.....##",
"#............#.#...............",
".#..#.......#.#.....#.#......##",
".#.#....#........#..##.........",
"..#....#......#.#...##...#.....",
"##.....#......................#",
"...#.......#..##.....#........#",
"......##..#...............##...",
".....#...#......##....#.#......",
".#...#....#.#.#........#...#.#.",
".......#...#...##...#..........",
".##..#..##........##....###.#..",
"..##........#........##........",
"............#....#......#......",
".......#...........#.......#...",
"#.#......##.#...#....#.#.....#.",
"..#.#.#......##........#....#..",
"#.#.####.#..#..........#.......",
"......................#.#......",
"...#.......#.....#......#..#.#.",
"...#....#....##..........#..##.",
"......#......#....#.........#..",
".........#....#...#.#.........#",
".....#...##.#.#.#......#.....#.",
"........#...#......#.#....#....",
".....#.........#.............#.",
".#...........#.#....##.......#.",
".#..#......#....#....#....#....",
"#.......#.#.#.#..#.......#.....",
"..#...#...#......#.............",
".....#.......#..#.........##..#",
"#..##...........#.#.........#..",
"#..#..........#....#......#...#",
"#...#............#....##..#.##.",
"....#.#..#....#.........##..##.",
".........#..........#.......##.",
"#...#........................#.",
"....#....#..#...........##...#.",
".....###.###.#....#.....#.....#",
".#..###..#...##..........#.....",
"#..#.....#...#........#........",
".#..##..#......#.....#......##.",
"#.....##........#.#..#....#.#..",
".#....#...#..#...............#.",
"..........#.#........#.....#...",
"..#.#.....#....#........#.###..",
"...#..#...#.##.....#..........#",
"..#......##....................",
".....#...#....#..#....#.......#",
"......#............#....#...#..",
".#..#....#.....#........##.....",
"...#..#.......#...............#",
"##.#..#...............#.#..##..",
"..#.........#.####.####........",
".........#...#.#........#..###.",
"..###.....#.........##........#",
"#..##.....##.#..........#....##",
".#..#....###..#.....##..#......",
"#...#..#........#.............#",
"#.#....#........#.........#.###",
".....#....#.###.......#........",
"...........#............#..#...",
"..........#.#..##......###....#",
"..##....#...........#....#....#",
"..#...##.#.......#.##.......#..",
".......#......#..........#....#",
".........#..#..............####",
"#.#...#...#......#...#..#...#.#",
".#.#...#.....#.......#.#..##.#.",
"......##..##...#...............",
"....#....#...##.......#.#......",
".............................#.",
"..##...#.......#......#.......#",
".#.##.##....#......##.......#..",
".......##..#....#.##.#.#.......",
"....#.............#......#..#..",
"...#.........#....#..#.....#.#.",
"......#......#......#.........#",
"........#..#.#.....#.....#...#.",
".#.......#.........#...#.......",
"#.#.##.....#...#...............",
"..#.......##.....#............#",
".................##.#..#.....##",
"........#.###....#.......##.#..",
"....#.#..#..#.......#.#....#..#",
".#..#..#..#...##....#..#.....#.",
"...#..#...#..........#........#",
"...........##....#...##.#...###",
".##..#.......##.....##....#....",
"...#.#..#..#..##..#.....##.....",
".#.....#..........#...#........",
".....#..#.#..#.................",
"..#.......#..#.....##.......#..",
"............##.##.....#...#....",
"#......#......................#",
"...#..........#...#...#..#.....",
"......##..............##.##....",
"................##......#.###..",
".###...#..........#...........#",
"#....#...#.........##......#...",
".............#...............#.",
".###.....#......#...#.......#..",
"......##..#.#.#.....#........#.",
"..#.#..........#.#......##.....",
".#.#...#.#.....#.#..#.....#....",
".......#....#.#....##..........",
"#.........#........####.#......",
"...#..#.....#..............#.#.",
"...#..........................#",
"..##....#..#..........#....#...",
"..##.##.#.#.#......#..#........",
"...#..#.#.#..#........#.......#",
".....#.....#..#...#........##..",
"..#..#...........#...##..##..#.",
"#.....#.....#..#..##........#..",
"...#..............#......#..#..",
"...#.#...........###...#.#.....",
"..........................#.#..",
"....#........#..#..........#.#.",
".#..#..........#.#..........#..",
"....#.........#......#.#....#..",
"..#........#.................#.",
"...#......#............#.......",
"...#.#...#..##....#........#...",
"......##.#....#.#......#.......",
"........#..........#........#..",
"###..#.....#...#......#...###..",
"..##...#..###............#...#.",
"#.......#..#..#............##..",
"#........####......#...........",
"#..#..#...........#.......####.",
"......#..##................#...",
".....#..##......#.#...#..#.....",
"......#.....##.....#.###.......",
".#.....#.........#.......#.#..#",
".##...........###...#....#...#.",
".#....#..#....#.##...#.........",
".................##............",
"......#......#.............#...",
".........##.#........#....#...#",
"..##....#.......#....##.#......",
".......#.#.#.....##..#.#.......",
"......#.#.#.#......#...#.......",
"....##...#.....#..#......#.....",
"..............#......#.##......",
"#.##..###........#.##........##",
"#..#.........#.#......#.#......",
".#..###.......#................",
"..............#...#..##.#.#....",
".....#..#........#...##.#...#..",
".#...##.....#........#..###.#..",
"....#.....#...#........#.......",
"....#.##.....#....#............",
"#.#..#....#....#............#..",
"....#....#...#.#...#...######..",
".##.........#..#.....#.....#...",
"..##...............#...........",
"........##...#........#..#.....",
"...#................###.##..##.",
".#..#..#..#...#.............#..",
"#.....#..##.#....#.#......#..#.",
"...#...#...#.....#...#...#.....",
"..##.###..#..#...##...........#",
".#.......##........#.#..#..#...",
"..#.......#.###................",
"..#...#........##...#..#......#",
"...#...#............#.#......#.",
"..#...#.....#.#.#.#........#...",
".#........#......##....##...#..",
"...#..##....#.........#....#.#.",
"....#........##...............#",
".###.....#...#..#.#.....#.....#",
"..#...#..................#...##",
"#..#....###....................",
"...........#...#...........#...",
"........#.....#................",
"#........#...........#........#",
"........#..#....#...#....#..#..",
"#.#....#......#.......##.......",
".#.....##..#...#......#.#.#....",
"..#..##.#.....#...#.#......#.#.",
".##....#...#....#......##......",
".#..#..#...##.##..#.#..#.......",
".....#.#...........#.#........#",
".#...#....#..................#.",
"...........#...#.........#.....",
".#..###........##......#..#...#",
".............###..##.....#.#..#",
".#..#..........#......#........",
"..#........#.#...#.......##.#..",
"....#...........##......#...#..",
"...........#....#.....#...#.#..",
"...#...........#.....#.#..#..#.",
"......#.......#................",
"##.......#.....#............#.#",
".##.....#.#.#..................",
"..........#.....##..#.#.#......",
".###.#.....##...#..#.#........#",
"#....#........##..#..#.........",
".............#.........##..#...",
"......##.#...#.#.#....##.......",
".#.......###.#.###..##........#",
"..##.....#..#.............#..#.",
".#...#......#.#.............#..",
"..##.#...#.........##....#...#.",
"...........#......#.#..........",
".....#..#...##.....#....#..#...",
"#...................##...#.....",
"..#.................#.....#....",
"..............#..#.#...###.....",
".......#........#...#.....#....",
".............#.......#...##..#.",
".#...#..#...#..#.....#......#.#",
"....#..#..#...#...........#....",
".....#..#......##.##....#..#...",
"...#......#..#.#...#.....#.....",
".......##..#.#.......#..#....##",
"#.#..#....##.##.#.#..........#.",
"..........#..........#....##.#.",
"....#.................#...#..#.",
"...#.....#..#...#.#...#..#.....",
"....#.#..###....#.............#",
"#....#..#.#..........#..#..#...",
"...#..#......#...#...#...#...#.",
"##....#.......#..........#.....",
"#......#.........#...#.........",
"##...##.#....#....#..#..#.#....",
"....#..#.....#.##.#.......#.#..",
"..##....##....#...#..####...#.#",
"..##..........#.............#..",
"..#......#..............#......",
"...#......#..#.#...#.......#...",
".#............#....#...##.##..#",
"..##..........#...........#..#.",
"..#..##..#....#..#.#..#..#..#.."
)