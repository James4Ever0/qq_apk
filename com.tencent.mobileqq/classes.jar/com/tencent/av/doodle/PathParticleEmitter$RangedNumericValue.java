package com.tencent.av.doodle;

import java.io.BufferedReader;

public class PathParticleEmitter$RangedNumericValue
  extends PathParticleEmitter.ParticleValue
{
  private float a;
  private float b;
  
  public float a()
  {
    return this.jdField_a_of_type_Float + (this.b - this.jdField_a_of_type_Float) * MathUtils.a();
  }
  
  public void a(BufferedReader paramBufferedReader)
  {
    super.a(paramBufferedReader);
    if (!this.jdField_a_of_type_Boolean) {
      return;
    }
    this.jdField_a_of_type_Float = PathParticleEmitter.a(paramBufferedReader, "lowMin");
    this.b = PathParticleEmitter.a(paramBufferedReader, "lowMax");
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes7.jar
 * Qualified Name:     com.tencent.av.doodle.PathParticleEmitter.RangedNumericValue
 * JD-Core Version:    0.7.0.1
 */