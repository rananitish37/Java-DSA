/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
// #include <iostream>
// #include <vector>
// #include <string>
#include<bits/stdc++.h>

struct Point {
    int x, y;
    Point(int a, int b) : x(a), y(b) {}
};

class WordSearch {
private:
    std::vector<std::string> puzzle;
    int n;

    bool isValid(int x, int y) {
        return x >= 0 && x < n && y >= 0 && y < n;
    }

    bool searchFromPoint(int x, int y, std::string word) {
        int dx[] = {-1, 1, 0, 0, -1, -1, 1, 1};
        int dy[] = {0, 0, -1, 1, -1, 1, -1, 1};
        for (int dir = 0; dir < 8; dir++) {
            int nx = x, ny = y, i;
            for (i = 0; i < word.size(); i++) {
                if (!isValid(nx, ny) || puzzle[nx][ny] != word[i]) break;
                nx += dx[dir];
                ny += dy[dir];
            }
            if (i == word.size()) {
                end = Point(nx - dx[dir], ny - dy[dir]);
                return true;
            }
        }
        return false;
    }

public:
    Point end;

    WordSearch(std::vector<std::string> p) {
        puzzle = p;
        n = puzzle.size();
    }

    Point search(std::string word) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (puzzle[i][j] == word[0] && searchFromPoint(i, j, word)) {
                    return Point(i, j);
                }
            }
        }
        return Point(-1, -1);
    }
};

int main() {
    std::vector<std::string> puzzle = {"jefblpepre", "camdcimgtc", "oivokprjsm", "pbwasqroua", "rixilelrhs", "wolcqlirpc", "screeuamgr", "alxbpuyril", "jalaycalmp", "clojurrmt"};
    WordSearch example(puzzle);
    Point start = example.search("clojure");
    std::cout << "Point(" << start.x << ", " << start.y << "), ";
    std::cout << "Point(" << example.end.x << ", " << example.end.y << ")\n";
    return 0;
}