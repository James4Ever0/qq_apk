import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.mobileqq.activity.ProfileActivity.AllInOne;
import com.tencent.mobileqq.activity.ProfileActivity.CardContactInfo;
import java.util.ArrayList;

public final class bay
  implements Parcelable.Creator
{
  public ProfileActivity.AllInOne a(Parcel paramParcel)
  {
    boolean bool = true;
    ProfileActivity.AllInOne localAllInOne = new ProfileActivity.AllInOne(null);
    localAllInOne.jdField_a_of_type_JavaLangString = paramParcel.readString();
    localAllInOne.jdField_a_of_type_Int = paramParcel.readInt();
    localAllInOne.jdField_b_of_type_Int = paramParcel.readInt();
    localAllInOne.jdField_a_of_type_Byte = paramParcel.readByte();
    localAllInOne.jdField_a_of_type_Short = ((short)paramParcel.readInt());
    localAllInOne.jdField_b_of_type_Byte = paramParcel.readByte();
    localAllInOne.jdField_c_of_type_Int = paramParcel.readInt();
    localAllInOne.jdField_c_of_type_Byte = paramParcel.readByte();
    localAllInOne.jdField_a_of_type_ArrayOfByte = paramParcel.createByteArray();
    localAllInOne.jdField_b_of_type_JavaLangString = paramParcel.readString();
    localAllInOne.jdField_c_of_type_JavaLangString = paramParcel.readString();
    localAllInOne.jdField_d_of_type_JavaLangString = paramParcel.readString();
    localAllInOne.jdField_e_of_type_JavaLangString = paramParcel.readString();
    localAllInOne.jdField_a_of_type_JavaUtilArrayList = new ArrayList();
    paramParcel.readTypedList(localAllInOne.jdField_a_of_type_JavaUtilArrayList, ProfileActivity.CardContactInfo.CREATOR);
    localAllInOne.jdField_d_of_type_Int = paramParcel.readInt();
    if (paramParcel.readByte() == 1) {}
    for (;;)
    {
      localAllInOne.jdField_a_of_type_Boolean = bool;
      localAllInOne.jdField_f_of_type_JavaLangString = paramParcel.readString();
      localAllInOne.jdField_e_of_type_Int = paramParcel.readInt();
      localAllInOne.jdField_h_of_type_JavaLangString = paramParcel.readString();
      localAllInOne.jdField_i_of_type_JavaLangString = paramParcel.readString();
      localAllInOne.jdField_j_of_type_JavaLangString = paramParcel.readString();
      localAllInOne.k = paramParcel.readString();
      localAllInOne.l = paramParcel.readString();
      localAllInOne.m = paramParcel.readString();
      localAllInOne.n = paramParcel.readString();
      localAllInOne.jdField_f_of_type_Int = paramParcel.readInt();
      localAllInOne.g = paramParcel.readInt();
      localAllInOne.jdField_h_of_type_Int = paramParcel.readInt();
      localAllInOne.jdField_b_of_type_ArrayOfByte = paramParcel.createByteArray();
      localAllInOne.jdField_i_of_type_Int = paramParcel.readInt();
      localAllInOne.jdField_j_of_type_Int = paramParcel.readInt();
      localAllInOne.o = paramParcel.readString();
      localAllInOne.p = paramParcel.readString();
      return localAllInOne;
      bool = false;
    }
  }
  
  public ProfileActivity.AllInOne[] a(int paramInt)
  {
    return new ProfileActivity.AllInOne[paramInt];
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\classes.jar
 * Qualified Name:     bay
 * JD-Core Version:    0.7.0.1
 */