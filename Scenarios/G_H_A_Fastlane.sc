﻿<?xml version="1.0" encoding="utf-8"?>
<Scenario xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema">
  <objectiveNumber>0</objectiveNumber>
  <scenarioType>Ambush</scenarioType>
  <FilePath>C:/Users/Ryanne/Desktop/Convoy/Assets/StreamingAssets/Scenarios/G_H_A_Fastlane.sc</FilePath>
  <BiomeType>Road</BiomeType>
  <CombatEndDialog>1</CombatEndDialog>
  <StartDialog>0</StartDialog>
  <CurrentDialog>0</CurrentDialog>
  <ShowGUI>false</ShowGUI>
  <Dialogs>
    <Dialog>
      <GraphRect>
        <x>157</x>
        <y>415</y>
        <position>
          <x>157</x>
          <y>415</y>
        </position>
        <center>
          <x>248.5</x>
          <y>510.477539</y>
        </center>
        <min>
          <x>157</x>
          <y>415</y>
        </min>
        <max>
          <x>340</x>
          <y>605.9551</y>
        </max>
        <width>183</width>
        <height>190.955078</height>
        <size>
          <x>183</x>
          <y>190.955078</y>
        </size>
        <xMin>157</xMin>
        <yMin>415</yMin>
        <xMax>340</xMax>
        <yMax>605.9551</yMax>
      </GraphRect>
      <Name>Start dialog</Name>
      <Text>Alongside the highway you spot a Quadinaros speedway.

It doesn't look like it has seen maintenance in quite some time, but the entry ramp appears functional. 

Attempting to use the speedway would allow you to regain [0#], at the risk of suffering damage if the speedway is too damaged.</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="ModifyJunk">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>171</x>
                <y>65</y>
                <position>
                  <x>171</x>
                  <y>65</y>
                </position>
                <center>
                  <x>176</x>
                  <y>70</y>
                </center>
                <min>
                  <x>171</x>
                  <y>65</y>
                </min>
                <max>
                  <x>181</x>
                  <y>75</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>171</xMin>
                <yMin>65</yMin>
                <xMax>181</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>3</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <Amount>0</Amount>
              <fuelAmount>20</fuelAmount>
            </ButtonAction>
            <ButtonAction xsi:type="ModifyJunk">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>171</x>
                <y>83</y>
                <position>
                  <x>171</x>
                  <y>83</y>
                </position>
                <center>
                  <x>176</x>
                  <y>88</y>
                </center>
                <min>
                  <x>171</x>
                  <y>83</y>
                </min>
                <max>
                  <x>181</x>
                  <y>93</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>171</xMin>
                <yMin>83</yMin>
                <xMax>181</xMax>
                <yMax>93</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>3</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <Amount>0</Amount>
              <fuelAmount>15</fuelAmount>
            </ButtonAction>
            <ButtonAction xsi:type="ModifyJunk">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>171</x>
                <y>101</y>
                <position>
                  <x>171</x>
                  <y>101</y>
                </position>
                <center>
                  <x>176</x>
                  <y>106</y>
                </center>
                <min>
                  <x>171</x>
                  <y>101</y>
                </min>
                <max>
                  <x>181</x>
                  <y>111</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>171</xMin>
                <yMin>101</yMin>
                <xMax>181</xMax>
                <yMax>111</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>3</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <Amount>0</Amount>
              <fuelAmount>10</fuelAmount>
            </ButtonAction>
          </Actions>
          <Name>Go for it!</Name>
          <convertedName />
        </DialogButton>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="CloseDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>0</x>
                <y>0</y>
                <position>
                  <x>0</x>
                  <y>0</y>
                </position>
                <center>
                  <x>0</x>
                  <y>0</y>
                </center>
                <min>
                  <x>0</x>
                  <y>0</y>
                </min>
                <max>
                  <x>0</x>
                  <y>0</y>
                </max>
                <width>0</width>
                <height>0</height>
                <size>
                  <x>0</x>
                  <y>0</y>
                </size>
                <xMin>0</xMin>
                <yMin>0</yMin>
                <xMax>0</xMax>
                <yMax>0</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
            <ButtonAction xsi:type="NextDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>171</x>
                <y>163</y>
                <position>
                  <x>171</x>
                  <y>163</y>
                </position>
                <center>
                  <x>176</x>
                  <y>168</y>
                </center>
                <min>
                  <x>171</x>
                  <y>163</y>
                </min>
                <max>
                  <x>181</x>
                  <y>173</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>171</xMin>
                <yMin>163</yMin>
                <xMax>181</xMax>
                <yMax>173</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>2</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Too risky, let's leave it.</Name>
          <convertedName />
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>301</x>
        <y>816</y>
        <position>
          <x>301</x>
          <y>816</y>
        </position>
        <center>
          <x>376</x>
          <y>866</y>
        </center>
        <min>
          <x>301</x>
          <y>816</y>
        </min>
        <max>
          <x>451</x>
          <y>916</y>
        </max>
        <width>150</width>
        <height>100</height>
        <size>
          <x>150</x>
          <y>100</y>
        </size>
        <xMin>301</xMin>
        <yMin>816</yMin>
        <xMax>451</xMax>
        <yMax>916</yMax>
      </GraphRect>
      <Name>Loot dialog</Name>
      <Text>[0loot]</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="AddLoot">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>0</x>
                <y>0</y>
                <position>
                  <x>0</x>
                  <y>0</y>
                </position>
                <center>
                  <x>0</x>
                  <y>0</y>
                </center>
                <min>
                  <x>0</x>
                  <y>0</y>
                </min>
                <max>
                  <x>0</x>
                  <y>0</y>
                </max>
                <width>0</width>
                <height>0</height>
                <size>
                  <x>0</x>
                  <y>0</y>
                </size>
                <xMin>0</xMin>
                <yMin>0</yMin>
                <xMax>0</xMax>
                <yMax>0</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <Amount>0</Amount>
            </ButtonAction>
          </Actions>
          <Name>Take loot</Name>
          <convertedName />
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>462</x>
        <y>602</y>
        <position>
          <x>462</x>
          <y>602</y>
        </position>
        <center>
          <x>540.5</x>
          <y>652</y>
        </center>
        <min>
          <x>462</x>
          <y>602</y>
        </min>
        <max>
          <x>619</x>
          <y>702</y>
        </max>
        <width>157</width>
        <height>100</height>
        <size>
          <x>157</x>
          <y>100</y>
        </size>
        <xMin>462</xMin>
        <yMin>602</yMin>
        <xMax>619</xMax>
        <yMax>702</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Ignoring the speedway, you continue your way.

A bit further down the road you see gigantic structural damage to the speedway, which would've probably resulted in your death had you attempted to use it.

Good call.</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="CloseDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>0</x>
                <y>0</y>
                <position>
                  <x>0</x>
                  <y>0</y>
                </position>
                <center>
                  <x>0</x>
                  <y>0</y>
                </center>
                <min>
                  <x>0</x>
                  <y>0</y>
                </min>
                <max>
                  <x>0</x>
                  <y>0</y>
                </max>
                <width>0</width>
                <height>0</height>
                <size>
                  <x>0</x>
                  <y>0</y>
                </size>
                <xMin>0</xMin>
                <yMin>0</yMin>
                <xMax>0</xMax>
                <yMax>0</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Phew.</Name>
          <convertedName />
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>494</x>
        <y>401</y>
        <position>
          <x>494</x>
          <y>401</y>
        </position>
        <center>
          <x>596.5</x>
          <y>470.5</y>
        </center>
        <min>
          <x>494</x>
          <y>401</y>
        </min>
        <max>
          <x>699</x>
          <y>540</y>
        </max>
        <width>205</width>
        <height>139</height>
        <size>
          <x>205</x>
          <y>139</y>
        </size>
        <xMin>494</xMin>
        <yMin>401</yMin>
        <xMax>699</xMax>
        <yMax>540</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>You drive your convoy up to the ramp and into the speedway and prepare to get boosted.

Multicoloured forward facing triangles surround you moments before you take off, the surrounding landscape turning into a blur.

Everything seems to be going well...</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="NextDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>193</x>
                <y>65</y>
                <position>
                  <x>193</x>
                  <y>65</y>
                </position>
                <center>
                  <x>198</x>
                  <y>70</y>
                </center>
                <min>
                  <x>193</x>
                  <y>65</y>
                </min>
                <max>
                  <x>203</x>
                  <y>75</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>193</xMin>
                <yMin>65</yMin>
                <xMax>203</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>5</Chance>
              <ToDialog>5</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
            <ButtonAction xsi:type="DamageRandomCar">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>193</x>
                <y>83</y>
                <position>
                  <x>193</x>
                  <y>83</y>
                </position>
                <center>
                  <x>198</x>
                  <y>88</y>
                </center>
                <min>
                  <x>193</x>
                  <y>83</y>
                </min>
                <max>
                  <x>203</x>
                  <y>93</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>193</xMin>
                <yMin>83</yMin>
                <xMax>203</xMax>
                <yMax>93</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>4</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <amount>1</amount>
              <random>true</random>
              <AmountAP>0</AmountAP>
              <AmountHP>0</AmountHP>
            </ButtonAction>
            <ButtonAction xsi:type="DamageRandomCar">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>193</x>
                <y>101</y>
                <position>
                  <x>193</x>
                  <y>101</y>
                </position>
                <center>
                  <x>198</x>
                  <y>106</y>
                </center>
                <min>
                  <x>193</x>
                  <y>101</y>
                </min>
                <max>
                  <x>203</x>
                  <y>111</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>193</xMin>
                <yMin>101</yMin>
                <xMax>203</xMax>
                <yMax>111</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>4</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <amount>2</amount>
              <random>true</random>
              <AmountAP>0</AmountAP>
              <AmountHP>0</AmountHP>
            </ButtonAction>
            <ButtonAction xsi:type="DamageRandomCar">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>193</x>
                <y>119</y>
                <position>
                  <x>193</x>
                  <y>119</y>
                </position>
                <center>
                  <x>198</x>
                  <y>124</y>
                </center>
                <min>
                  <x>193</x>
                  <y>119</y>
                </min>
                <max>
                  <x>203</x>
                  <y>129</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>193</xMin>
                <yMin>119</yMin>
                <xMax>203</xMax>
                <yMax>129</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>4</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <amount>3</amount>
              <random>true</random>
              <AmountAP>0</AmountAP>
              <AmountHP>0</AmountHP>
            </ButtonAction>
          </Actions>
          <Name>Continue.</Name>
          <convertedName />
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>866</x>
        <y>501</y>
        <position>
          <x>866</x>
          <y>501</y>
        </position>
        <center>
          <x>941.5</x>
          <y>551</y>
        </center>
        <min>
          <x>866</x>
          <y>501</y>
        </min>
        <max>
          <x>1017</x>
          <y>601</y>
        </max>
        <width>151</width>
        <height>100</height>
        <size>
          <x>151</x>
          <y>100</y>
        </size>
        <xMin>866</xMin>
        <yMin>501</yMin>
        <xMax>1017</xMax>
        <yMax>601</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>... until now.

Large quadrants of the speedway are missing, causing an imbalance in the repulsor field.

Whilst you managed to keep your convoy on the speedway, rather than crashing off to the side, you did suffer some damage from crashing into the walls.</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="NextDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>139</x>
                <y>65</y>
                <position>
                  <x>139</x>
                  <y>65</y>
                </position>
                <center>
                  <x>144</x>
                  <y>70</y>
                </center>
                <min>
                  <x>139</x>
                  <y>65</y>
                </min>
                <max>
                  <x>149</x>
                  <y>75</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>139</xMin>
                <yMin>65</yMin>
                <xMax>149</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>5</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Damn...</Name>
          <convertedName />
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>1152</x>
        <y>406</y>
        <position>
          <x>1152</x>
          <y>406</y>
        </position>
        <center>
          <x>1230.5</x>
          <y>456</y>
        </center>
        <min>
          <x>1152</x>
          <y>406</y>
        </min>
        <max>
          <x>1309</x>
          <y>506</y>
        </max>
        <width>157</width>
        <height>100</height>
        <size>
          <x>157</x>
          <y>100</y>
        </size>
        <xMin>1152</xMin>
        <yMin>406</yMin>
        <xMax>1309</xMax>
        <yMax>506</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Eventually, you arrive at the end of the speedway and succesfully return to the normal road.</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="CloseDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>0</x>
                <y>0</y>
                <position>
                  <x>0</x>
                  <y>0</y>
                </position>
                <center>
                  <x>0</x>
                  <y>0</y>
                </center>
                <min>
                  <x>0</x>
                  <y>0</y>
                </min>
                <max>
                  <x>0</x>
                  <y>0</y>
                </max>
                <width>0</width>
                <height>0</height>
                <size>
                  <x>0</x>
                  <y>0</y>
                </size>
                <xMin>0</xMin>
                <yMin>0</yMin>
                <xMax>0</xMax>
                <yMax>0</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Keep going.</Name>
          <convertedName />
        </DialogButton>
      </DialogButtons>
    </Dialog>
  </Dialogs>
  <Name>G_H_A_Fastlane</Name>
</Scenario>