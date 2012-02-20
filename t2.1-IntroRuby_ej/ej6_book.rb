class Book < Object
  
  def initialize(title, description, stock)
    @title = title
    @description = description
    @stock = stock
  end
  
  attr_accessor    :title
  attr_reader      :description
  attr_accessor     :stock 
  
  def upper_case_title
    return @title.uppercase
  end
  
  def stock?
    return true if stock!=0
    return false if stock==0
  end
  
  AGOTADO = 'Libro agotado'
end 
