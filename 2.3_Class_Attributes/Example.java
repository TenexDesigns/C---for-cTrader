/* We use the colon sign to designate inheritance.
Additionally, we used expressions in square brackets to
specify the parameters that apply to the entire class */
[Robot(AccessRights = AccessRights.None)]
public class NewBot : Robot
{
    /* We declare a custom class property and make it
    read-only. */
    public string CustomProperty { get; }

    /* In this declaration, we define the default value of a
    custom parameter. */
    [Parameter("BotName", DefaultValue = "Traders First!")]

    /* We declare the BotName property which is changeable via
    the "BotName" parameter. */
    public string BotName { get; }

    /* We also declare the BotComment parameter.
    It can be both read and set. */
    [Parameter("BotComment", DefaultValue = "Our super-duper bot!")]
    public string BotComment { get; set; }
}


In the code snippet you provided, several features of C# and cTrader's cBots are demonstrated. Let's break down each part:

1. **Class Declaration:**
   - The class `NewBot` is declared, which presumably represents a new trading bot in cTrader.

2. **Inheritance:**
   - The class `NewBot` inherits from the `Robot` class using the colon `:` notation. This means that `NewBot` inherits all the members and methods of the `Robot` class.

3. **Class Attribute:**
   - The `[Robot]` attribute is applied to the `NewBot` class. Attributes provide metadata about types and members at runtime. In this case, the `Robot` attribute specifies that the `NewBot` class has `AccessRights` set to `AccessRights.None`.

4. **Properties:**
   - `CustomProperty` is a read-only property of type `string`. Its value is determined elsewhere and cannot be changed within the class.
   - `BotName` and `BotComment` are properties representing parameters that can be configured for the bot. They have corresponding `[Parameter]` attributes applied to them.
  
5. **Parameter Attributes:**
   - `[Parameter]` attributes are used to specify properties that can be configured via parameters in cTrader. These parameters are configurable by users when they use the bot in the cTrader platform.
   - The `DefaultValue` property of the `[Parameter]` attribute sets the default value for the parameter if it is not explicitly provided when configuring the bot.

Overall, this code snippet demonstrates how to define a new cTrader bot class in C#. It shows how to inherit from existing classes, apply attributes to the class and its members, and define properties with parameters that can be configured by users in the cTrader platform.
