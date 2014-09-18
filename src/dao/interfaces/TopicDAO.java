package dao.interfaces;

import entity.*;
import java.util.*;

public interface TopicDAO
{
    public void save(Topic topic);  
    public List query(String hql, Object... params);
    public List query(final String hql, final int firstRow, final int maxRow, final Object...params);
    public void execute(final String hql, final Object... params);
}
