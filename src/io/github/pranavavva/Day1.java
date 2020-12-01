package io.github.pranavavva;

public class Day1 {
    public static void main(String[] args) {
        int[] expenseReport = {1953, 2006, 1926, 1946, 1722, 1776, 1924, 1860, 2002, 1920, 1911, 1750, 1657, 2005, 1829,
                1693, 1717, 1844, 1642, 1875, 1741, 1755, 1688, 1700, 1842, 1598, 1942, 1599, 1710, 1627, 1915, 1913,
                1814, 1852, 1564, 1877, 1569, 1669, 2009, 1807, 1906, 1838, 1794, 1839, 1783, 1851, 1716, 1705, 1914,
                1786, 1812, 1616, 1997, 1718, 1984, 1751, 1810, 1928, 1701, 1632, 1948, 616, 1981, 1878, 1903, 1690,
                1836, 1631, 1649, 1562, 1707, 457, 1861, 1843, 979, 1605, 1652, 1596, 1730, 1560, 1886, 1802, 1614,
                1929, 1570, 1907, 1950, 1969, 1629, 1769, 1575, 1932, 1983, 1781, 1954, 1663, 1644, 2004, 1772, 1044,
                794, 1882, 1808, 1831, 1635, 1976, 1834, 1855, 1721, 1372, 1777, 1702, 1945, 1788, 1989, 1819, 1874,
                1720, 787, 1806, 1966, 1949, 1694, 1752, 1887, 1687, 1943, 1665, 1774, 1645, 1900, 1661, 1968, 1706,
                1586, 1977, 1691, 1991, 1870, 1865, 1764, 1967, 1714, 1594, 1429, 1647, 1858, 1805, 1561, 1895, 1559,
                1988, 1565, 1799, 1862, 1578, 1664, 1816, 1628, 1960, 1775, 1746, 1324, 1835, 1658, 1918, 1671, 1957,
                1864, 696, 1679, 254, 1017, 1622, 1601, 1592, 1782, 1767, 1825, 1655, 1784, 1896, 1965, 1600, 1963,
                1840, 1749, 1970, 1980, 1936, 1685, 1790, 1902, 1729, 2001, 1638, 1986, 1879, 1847, 1866};

        int[] theTwoNumbers = findTwoNumbers(expenseReport);
        int[] theThreeNumbers = findThreeNumbers(expenseReport);

        System.out.println("The product of the two numbers that sum to 2020 is: " + theTwoNumbers[0] *
                theTwoNumbers[1]);
        System.out.println("The product of the three numbers that sum to 2020 is: " + theThreeNumbers[0] *
                theThreeNumbers[1] * theThreeNumbers[2]);
    }

    private static int[] findTwoNumbers(int[] expenseReport) {
        for (int i = 0; i < expenseReport.length - 1; i++) {
            for (int j = i + 1; j < expenseReport.length; j++) {
                if (expenseReport[i] + expenseReport[j] == 2020) {
                    return new int[]{expenseReport[i], expenseReport[j]};
                }
            }
        }
        return null;
    }

    private static int[] findThreeNumbers(int[] expenseReport) {
        for (int i = 0; i < expenseReport.length - 2; i++) {
            for (int j = i + 1; j < expenseReport.length - 1; j++) {
                for (int k = j + 1; k < expenseReport.length; k++) {
                    if (expenseReport[i] + expenseReport[j] + expenseReport[k] == 2020) {
                        return new int[]{expenseReport[i], expenseReport[j], expenseReport[k]};
                    }
                }
            }
        }
        return null;
    }
}
