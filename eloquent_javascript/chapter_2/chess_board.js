var size = 8;

for (line = 1; line <= size; line++) {
  for (column = ''; column.length < size; ) {
    if ((column.length % 2 !== 0 && line % 2 !== 0) || (column.length % 2 == 0 && line % 2 == 0)) {
      column += '#';
    } else {
      column += ' ';
    };
  };
  console.log(column);
};
