console.log(countBs('BarBarella', 'a'));

function countBs(aString, aLetter) {
  var bCount = 0;
  for (i = 0; i < aString.length; i++) {
    if (aString.charAt(i) == 'B') {
      bCount++;
    };
  };
  return (bCount + '; ' + countChar(aString, aLetter));
}

function countChar(aString, aLetter) {
  var letterCount = 0;
  for (i = 0; i < aString.length; i++) {
    if (aString.charAt(i) == aLetter) {
      letterCount++;
    };
  };
  return letterCount;
}
