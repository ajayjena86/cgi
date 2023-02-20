public boolean equals(Object o)
{
    if ((o instanceof Article) && \
        (title == ((Article)o).title) && \
        (pubDate.YEAR == (((Article)o).pubDate.YEAR)) && \
        (pubDate.DAY_OF_YEAR == ((Article)o).pubDate.DAY_OF_YEAR))
 
        return true;
 
    return false;
}