document distance is the angle which shows the similarity between the two documents.
get rid of punctuation. 
convert everything to lower case split into arrays of words for both the document.
make a dictionary  and keep the frequency of the words i.e the vector data.
find the dot product of both vectors divide them by square root of product of length of both vectors.  
take arccos of the value to get the angle which is in radians convert to degree. 
0 degree means both the document are identical , 90 degree means both the documents don't share any words.
