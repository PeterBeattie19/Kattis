def read_input():
    board = [list(input()) for _ in range(8)]
    directions = input() 
    return board, directions 


class Turtle:
    def __init__(self, row=7, col=0, direction=1):
        self._row = row
        self._col = col
        # 0:N, 1:E, 2:S, 3:W
        self._direction = direction
        self.direction_map = {0: (-1, 0), 1: (0, 1), 2: (1, 0), 3: (0, -1)}

    @property
    def row(self):
        return self._row

    @property
    def col(self):
        return self._col

    @property
    def direction(self):
        return self._direction

    @property
    def position(self):
        return self._row, self._col

    @staticmethod
    def _change_direction(cur_direc, val):
        if val < 0:
            return (cur_direc + val) % 4
        else:
            return (cur_direc + (val % 4)) % 4

    def turn_right(self):
        self._direction = self._change_direction(self._direction, 1)

    def turn_left(self):
        self._direction = self._change_direction(self._direction, -1)

    def move_forward(self):
        moves = self.direction_map[self._direction]
        self._row += moves[0]
        self._col += moves[1]


class Board:
    def __init__(self, grid):
        self._grid = grid
        self._turtle = Turtle()
        self._cmd_to_func = {"F": self.forward, "R": self.right, "L": self.left, "X": self.fire_laser}

    @property
    def turtle(self):
        return self._turtle

    def forward(self):
        self._turtle.move_forward()
        new_pos = self._turtle.position
        if not self._check_boundary(self._turtle.position) or self._grid[new_pos[0]][new_pos[1]] not in ['.', 'D']:
            return False
        return True

    def right(self):
        self._turtle.turn_right()
        return True

    def left(self):
        self._turtle.turn_left()
        return True

    def _check_boundary(self, pos):
        try:
            self._grid[pos[0]][pos[1]]
        except IndexError:
            return False
        return True

    def _laser_error_check(self, target_pos):
        if not self._check_boundary(target_pos):
            return True
        val_ = self._grid[target_pos[0]][target_pos[1]]
        if val_ == 'I':
            return False
        return True

    def fire_laser(self):
        turtle_position = (self._turtle.row, self._turtle.col)
        turtle_direction = self._turtle.direction
        move_row, move_col = self._turtle.direction_map[turtle_direction]
        target = (turtle_position[0] + move_row, turtle_position[1] + move_col)
        if self._laser_error_check(target):
            return False
        else:
            self._grid[target[0]][target[1]] = '.'
            return True

    def in_winning_state(self):
        pos = self.turtle.position
        return self._grid[pos[0]][pos[1]] == "D"

    def execute_commands(self, commands):
        for cmd in commands:
            res = self._cmd_to_func[cmd]()
            if not res:
                return False
        return self.in_winning_state()


board_, directions_ = read_input()
brd = Board(board_)

if brd.execute_commands(directions_):
    print("Diamond!")

else:
    print("Bug!")
