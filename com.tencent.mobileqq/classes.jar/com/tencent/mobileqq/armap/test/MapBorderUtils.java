package com.tencent.mobileqq.armap.test;

public class MapBorderUtils
{
  public static MapBorderUtils.LatLng[] a;
  public static String[] a;
  
  static
  {
    jdField_a_of_type_ArrayOfJavaLangString = new String[] { "大连市", "香港特别行政区", "深圳罗湖区", "深圳福田区", "深圳南山区", "深圳宝安区", "深圳龙岗区", "深圳盐田区", "佛山", "东莞", "珠海市香洲区", "珠海市拱北区", "成都武侯区", "重庆渝中", "广州越秀区", "广州荔湾区", "广州海珠区", "广州天河区", "广州白云区", "广州黄埔区", "广州番禺区", "广州花都区", "广州南沙区", "广州增城区", "广州从化区", "广州塔", "北京东城区", "北京西城区", "北京朝阳区", "北京丰台区", "北京石景山区", "北京海淀区", "北京门头沟区", "北京房山区", "北京通州区", "北京顺义区", "北京昌平区", "北京大兴区", "北京怀柔区", "北京平谷区", "北京密云区", "北京延庆区", "北京故宫", "上海黄浦区", "上海浦东新区", "上海徐汇区", "上海长宁区", "上海静安区", "上海普陀区", "上海虹口区", "上海杨浦区", "上海闵行区", "上海宝山区", "上海嘉定区", "上海金山区", "上海松江区", "上海青浦区", "上海奉贤区", "上海崇明区", "东方明珠广播电视塔", "西安新城区", "西安碑林区", "西安莲湖区", "西安雁塔区", "西安未央区", "西安灞桥区", "西安长安区", "西安阎良区", "西安临潼区", "西安蓝田县", "西安爱至县", "西安高陵县", "西安户县", "腾讯大厦" };
    jdField_a_of_type_ArrayOfComTencentMobileqqArmapTestMapBorderUtils$LatLng = new MapBorderUtils.LatLng[] { new MapBorderUtils.LatLng(121.52549999999999D, 38.95223D), new MapBorderUtils.LatLng(113.98029D, 22.38767D), new MapBorderUtils.LatLng(114.13111000000001D, 22.548950000000001D), new MapBorderUtils.LatLng(114.05454D, 22.52291D), new MapBorderUtils.LatLng(113.93040999999999D, 22.53332D), new MapBorderUtils.LatLng(113.88308000000001D, 22.553290000000001D), new MapBorderUtils.LatLng(114.24778999999999D, 22.719909999999999D), new MapBorderUtils.LatLng(114.23748000000001D, 22.557860000000002D), new MapBorderUtils.LatLng(113.11991999999999D, 23.015999999999998D), new MapBorderUtils.LatLng(113.76273999999999D, 23.03809D), new MapBorderUtils.LatLng(113.54259999999999D, 22.264299999999999D), new MapBorderUtils.LatLng(113.5536D, 22.222999999999999D), new MapBorderUtils.LatLng(104.06475D, 30.570150000000002D), new MapBorderUtils.LatLng(106.55076D, 29.564710000000002D), new MapBorderUtils.LatLng(113.26933D, 23.12079D), new MapBorderUtils.LatLng(113.2366D, 23.124790000000001D), new MapBorderUtils.LatLng(113.32098000000001D, 23.0959D), new MapBorderUtils.LatLng(113.32576D, 23.133050000000001D), new MapBorderUtils.LatLng(113.25783D, 23.15907D), new MapBorderUtils.LatLng(113.46642D, 23.16891D), new MapBorderUtils.LatLng(113.31279000000001D, 23.001709999999999D), new MapBorderUtils.LatLng(113.21850999999999D, 23.408180000000002D), new MapBorderUtils.LatLng(113.53286D, 22.79411D), new MapBorderUtils.LatLng(113.81498999999999D, 23.276199999999999D), new MapBorderUtils.LatLng(113.58902999999999D, 23.547720000000002D), new MapBorderUtils.LatLng(113.32443000000001D, 23.106590000000001D), new MapBorderUtils.LatLng(116.42238999999999D, 39.924129999999998D), new MapBorderUtils.LatLng(116.38115999999999D, 39.904490000000003D), new MapBorderUtils.LatLng(116.51552D, 39.93394D), new MapBorderUtils.LatLng(116.28616D, 39.858550000000001D), new MapBorderUtils.LatLng(116.223D, 39.905679999999997D), new MapBorderUtils.LatLng(116.29846000000001D, 39.959290000000003D), new MapBorderUtils.LatLng(116.10145D, 39.940440000000002D), new MapBorderUtils.LatLng(116.14295D, 39.747819999999997D), new MapBorderUtils.LatLng(116.65714D, 39.909959999999998D), new MapBorderUtils.LatLng(116.65476D, 40.130130000000001D), new MapBorderUtils.LatLng(116.2633D, 40.222000000000001D), new MapBorderUtils.LatLng(116.34211000000001D, 39.731940000000002D), new MapBorderUtils.LatLng(116.63726D, 40.315950000000001D), new MapBorderUtils.LatLng(117.11527D, 40.135089999999998D), new MapBorderUtils.LatLng(116.83526999999999D, 40.374360000000003D), new MapBorderUtils.LatLng(115.97068D, 40.455880000000001D), new MapBorderUtils.LatLng(116.39699D, 39.918500000000002D), new MapBorderUtils.LatLng(121.49593D, 31.207809999999998D), new MapBorderUtils.LatLng(121.50013D, 31.237410000000001D), new MapBorderUtils.LatLng(121.42111D, 31.13401D), new MapBorderUtils.LatLng(121.42601000000001D, 31.219149999999999D), new MapBorderUtils.LatLng(121.45865999999999D, 31.23067D), new MapBorderUtils.LatLng(121.34305999999999D, 31.283249999999999D), new MapBorderUtils.LatLng(121.47947000000001D, 31.258959999999998D), new MapBorderUtils.LatLng(121.50894D, 31.29523D), new MapBorderUtils.LatLng(121.37694999999999D, 31.108519999999999D), new MapBorderUtils.LatLng(121.4894D, 31.405280000000001D), new MapBorderUtils.LatLng(121.24916D, 31.377549999999999D), new MapBorderUtils.LatLng(121.3424D, 30.741869999999999D), new MapBorderUtils.LatLng(121.21793D, 31.038589999999999D), new MapBorderUtils.LatLng(121.11187D, 31.150120000000001D), new MapBorderUtils.LatLng(121.47668D, 30.907489999999999D), new MapBorderUtils.LatLng(121.40315D, 31.617439999999998D), new MapBorderUtils.LatLng(121.49968D, 31.23978D), new MapBorderUtils.LatLng(109.00521999999999D, 34.259250000000002D), new MapBorderUtils.LatLng(108.9404D, 34.256570000000004D), new MapBorderUtils.LatLng(108.94752D, 34.282159999999998D), new MapBorderUtils.LatLng(108.91014D, 34.21904D), new MapBorderUtils.LatLng(108.88959D, 34.312910000000002D), new MapBorderUtils.LatLng(109.06452D, 34.278239999999997D), new MapBorderUtils.LatLng(108.90696D, 34.158929999999998D), new MapBorderUtils.LatLng(109.17742D, 34.665649999999999D), new MapBorderUtils.LatLng(109.21672D, 34.372070000000001D), new MapBorderUtils.LatLng(109.31921D, 34.144750000000002D), new MapBorderUtils.LatLng(108.22302000000001D, 34.160170000000001D), new MapBorderUtils.LatLng(109.09372D, 34.534759999999999D), new MapBorderUtils.LatLng(108.60946D, 34.125349999999997D), new MapBorderUtils.LatLng(113.93465D, 22.540469999999999D) };
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes4.jar
 * Qualified Name:     com.tencent.mobileqq.armap.test.MapBorderUtils
 * JD-Core Version:    0.7.0.1
 */