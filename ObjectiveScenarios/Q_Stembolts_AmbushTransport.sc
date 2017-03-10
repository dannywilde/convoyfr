<?xml version="1.0" encoding="utf-8"?>
<Scenario xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema">
  <objectiveNumber>0</objectiveNumber>
  <scenarioType>Ambush</scenarioType>
  <FilePath>D:/Convoy/Assets/ObjectiveScenarios/Q_Stembolts_AmbushTransport.sc</FilePath>
  <BiomeType>Road</BiomeType>
  <CombatEndDialog>1</CombatEndDialog>
  <StartDialog>0</StartDialog>
  <CurrentDialog>0</CurrentDialog>
  <ShowGUI>false</ShowGUI>
  <Dialogs>
    <Dialog>
      <GraphRect>
        <x>2</x>
        <y>502</y>
        <center>
          <x>85</x>
          <y>552.5</y>
        </center>
        <width>166</width>
        <height>101</height>
        <xMin>2</xMin>
        <yMin>502</yMin>
        <xMax>168</xMax>
        <yMax>603</yMax>
      </GraphRect>
      <Name>Start dialog</Name>
      <Text>You arrive at the location the Eiffels Inc. transport is supposed to be passing through, according to your stolen transport list.</Text>
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
                <x>154</x>
                <y>65</y>
                <center>
                  <x>159</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>154</xMin>
                <yMin>65</yMin>
                <xMax>164</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>2</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
            <ButtonAction xsi:type="NextDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>154</x>
                <y>83</y>
                <center>
                  <x>159</x>
                  <y>88</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>154</xMin>
                <yMin>83</yMin>
                <xMax>164</xMax>
                <yMax>93</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>3</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Investigate the area.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>995</x>
        <y>171</y>
        <center>
          <x>1070</x>
          <y>221</y>
        </center>
        <width>150</width>
        <height>100</height>
        <xMin>995</xMin>
        <yMin>171</yMin>
        <xMax>1145</xMax>
        <yMax>271</yMax>
      </GraphRect>
      <Name>Loot dialog</Name>
      <Text>You have succesfully destroyed the Eiffels Inc. transport caravan and its escort vehicles.

[0loot]</Text>
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
                <x>138</x>
                <y>65</y>
                <center>
                  <x>143</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>138</xMin>
                <yMin>65</yMin>
                <xMax>148</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>16</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <Amount>0</Amount>
            </ButtonAction>
          </Actions>
          <Name>Excellent!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>297</x>
        <y>282</y>
        <center>
          <x>399.5</x>
          <y>333.5</y>
        </center>
        <width>205</width>
        <height>103</height>
        <xMin>297</xMin>
        <yMin>282</yMin>
        <xMax>502</xMax>
        <yMax>385</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>You manage to find an excellent ambush location.

Assuming the transport actually passes through this area, it should give you a massive advantage in the following combat.</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="DamageRandomCar">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>193</x>
                <y>65</y>
                <center>
                  <x>198</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>193</xMin>
                <yMin>65</yMin>
                <xMax>203</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>6</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
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
                <y>83</y>
                <center>
                  <x>198</x>
                  <y>88</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>193</xMin>
                <yMin>83</yMin>
                <xMax>203</xMax>
                <yMax>93</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>7</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <AmountAP>0</AmountAP>
              <AmountHP>0</AmountHP>
            </ButtonAction>
          </Actions>
          <Name>Wait...</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>257</x>
        <y>641</y>
        <center>
          <x>332.5</x>
          <y>714.5</y>
        </center>
        <width>151</width>
        <height>147</height>
        <xMin>257</xMin>
        <yMin>641</yMin>
        <xMax>408</xMax>
        <yMax>788</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>It turns out you've arrived just in time, as you see the transport driving in the distance.

They seem to be guarded by the same type of heavy vehicles patrolling the Eiffels Inc. office building.</Text>
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
                <center>
                  <x>144</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>139</xMin>
                <yMin>65</yMin>
                <xMax>149</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>4</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
            <ButtonAction xsi:type="NextDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>139</x>
                <y>83</y>
                <center>
                  <x>144</x>
                  <y>88</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>139</xMin>
                <yMin>83</yMin>
                <xMax>149</xMax>
                <yMax>93</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>5</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Attack them!</Name>
        </DialogButton>
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
                <y>127</y>
                <center>
                  <x>144</x>
                  <y>132</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>139</xMin>
                <yMin>127</yMin>
                <xMax>149</xMax>
                <yMax>137</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>8</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Radio them.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>542</x>
        <y>529</y>
        <center>
          <x>617</x>
          <y>579</y>
        </center>
        <width>150</width>
        <height>100</height>
        <xMin>542</xMin>
        <yMin>529</yMin>
        <xMax>692</xMax>
        <yMax>629</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>You move in to engage the transport, guns blazing.

This head-on approach doesn't give you any combat advantages, but it might prove succesful regardless.</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="StartBattle">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>0</x>
                <y>0</y>
                <center>
                  <x>0</x>
                  <y>0</y>
                </center>
                <width>0</width>
                <height>0</height>
                <xMin>0</xMin>
                <yMin>0</yMin>
                <xMax>0</xMax>
                <yMax>0</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <enemyType>Keepers</enemyType>
              <difficulty>0</difficulty>
            </ButtonAction>
          </Actions>
          <Name>Time to fight!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>589</x>
        <y>651</y>
        <center>
          <x>664</x>
          <y>701</y>
        </center>
        <width>150</width>
        <height>100</height>
        <xMin>589</xMin>
        <yMin>651</yMin>
        <xMax>739</xMax>
        <yMax>751</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Your head-on approach is easily met by the defending forces, leaving you at a disadvantage in the following combat.
</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="StartBattle">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>0</x>
                <y>0</y>
                <center>
                  <x>0</x>
                  <y>0</y>
                </center>
                <width>0</width>
                <height>0</height>
                <xMin>0</xMin>
                <yMin>0</yMin>
                <xMax>0</xMax>
                <yMax>0</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <enemyType>Keepers</enemyType>
              <difficulty>1</difficulty>
            </ButtonAction>
          </Actions>
          <Name>Time to fight!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>557</x>
        <y>93</y>
        <center>
          <x>632.5</x>
          <y>143</y>
        </center>
        <width>151</width>
        <height>100</height>
        <xMin>557</xMin>
        <yMin>93</yMin>
        <xMax>708</xMax>
        <yMax>193</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>You lie in wait and, eventually, you spot the transport coming your way.

You manage to catch them completely by surprise, wiping out all escort vehicles without suffering any damage whatsoever!
</Text>
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
                <center>
                  <x>144</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>139</xMin>
                <yMin>65</yMin>
                <xMax>149</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>1</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Excellent!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>588</x>
        <y>294</y>
        <center>
          <x>663</x>
          <y>344</y>
        </center>
        <width>150</width>
        <height>100</height>
        <xMin>588</xMin>
        <yMin>294</yMin>
        <xMax>738</xMax>
        <yMax>394</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>You lie in wait and, eventually, you spot the transport coming your way.

You manage to catch them by surprise, gaining a massive advantage in the following combat!</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="StartBattle">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>0</x>
                <y>0</y>
                <center>
                  <x>0</x>
                  <y>0</y>
                </center>
                <width>0</width>
                <height>0</height>
                <xMin>0</xMin>
                <yMin>0</yMin>
                <xMax>0</xMax>
                <yMax>0</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <enemyType>Keepers</enemyType>
              <difficulty>-1</difficulty>
            </ButtonAction>
          </Actions>
          <Name>Great!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>548</x>
        <y>844</y>
        <center>
          <x>685</x>
          <y>948.5</y>
        </center>
        <width>274</width>
        <height>209</height>
        <xMin>548</xMin>
        <yMin>844</yMin>
        <xMax>822</xMax>
        <yMax>1053</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"Greetings.

We are a heavily armed transport caravan owned by Eiffels Inc.

Please state your business."
</Text>
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
                <x>262</x>
                <y>65</y>
                <center>
                  <x>267</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>262</xMin>
                <yMin>65</yMin>
                <xMax>272</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>3</Chance>
              <ToDialog>10</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
            <ButtonAction xsi:type="NextDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>262</x>
                <y>83</y>
                <center>
                  <x>267</x>
                  <y>88</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>262</xMin>
                <yMin>83</yMin>
                <xMax>272</xMax>
                <yMax>93</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>11</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>We demand your Self-sealing stem bolts!</Name>
        </DialogButton>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="NextDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>262</x>
                <y>127</y>
                <center>
                  <x>267</x>
                  <y>132</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>262</xMin>
                <yMin>127</yMin>
                <xMax>272</xMax>
                <yMax>137</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>13</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
            <ButtonAction xsi:type="NextDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>262</x>
                <y>145</y>
                <center>
                  <x>267</x>
                  <y>150</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>262</xMin>
                <yMin>145</yMin>
                <xMax>272</xMax>
                <yMax>155</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>14</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>We are in need of help!</Name>
        </DialogButton>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="NextDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>262</x>
                <y>189</y>
                <center>
                  <x>267</x>
                  <y>194</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>262</xMin>
                <yMin>189</yMin>
                <xMax>272</xMax>
                <yMax>199</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>9</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Prepare to die!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>1332</x>
        <y>1053</y>
        <center>
          <x>1407</x>
          <y>1103</y>
        </center>
        <width>150</width>
        <height>100</height>
        <xMin>1332</xMin>
        <yMin>1053</yMin>
        <xMax>1482</xMax>
        <yMax>1153</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Alerting your target of your presence before attacking them isn't the best of ideas.

You are at a disadvantage in the following combat.</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="StartBattle">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>0</x>
                <y>0</y>
                <center>
                  <x>0</x>
                  <y>0</y>
                </center>
                <width>0</width>
                <height>0</height>
                <xMin>0</xMin>
                <yMin>0</yMin>
                <xMax>0</xMax>
                <yMax>0</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <enemyType>Keepers</enemyType>
              <difficulty>1</difficulty>
            </ButtonAction>
          </Actions>
          <Name>Time to fight!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>946</x>
        <y>485</y>
        <center>
          <x>1079.5</x>
          <y>549.5</y>
        </center>
        <width>267</width>
        <height>129</height>
        <xMin>946</xMin>
        <yMin>485</yMin>
        <xMax>1213</xMax>
        <yMax>614</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"Your demands are noted, but we do not intend to deliver.

Our offensive capabilities surpass your own.

We do not wish to take the lives of your crew, so we suggest you leave."
</Text>
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
                <x>255</x>
                <y>65</y>
                <center>
                  <x>260</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>255</xMin>
                <yMin>65</yMin>
                <xMax>265</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>9</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>No can't do, we need those stem bolts!</Name>
        </DialogButton>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="NextDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>255</x>
                <y>109</y>
                <center>
                  <x>260</x>
                  <y>114</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>255</xMin>
                <yMin>109</yMin>
                <xMax>265</xMax>
                <yMax>119</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>15</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Fine, we'll leave.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>956</x>
        <y>640</y>
        <center>
          <x>1031.5</x>
          <y>690</y>
        </center>
        <width>151</width>
        <height>100</height>
        <xMin>956</xMin>
        <yMin>640</yMin>
        <xMax>1107</xMax>
        <yMax>740</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"Unfortunately, we believe we are outmatched if we were to get into a combat situation.

Very well. We agree to supply you with our shipment of stem bolts if you agree to let us live."
</Text>
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
                <center>
                  <x>144</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>139</xMin>
                <yMin>65</yMin>
                <xMax>149</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>12</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Excellent!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>1300</x>
        <y>626</y>
        <center>
          <x>1375</x>
          <y>676</y>
        </center>
        <width>150</width>
        <height>100</height>
        <xMin>1300</xMin>
        <yMin>626</yMin>
        <xMax>1450</xMax>
        <yMax>726</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>You confiscate the shipment of Self-sealing stem bolts and secure them in your own cargo hold.

These should prove more than adequate for your spaceship!

Better to avoid the Eiffels Inc. headquarters in the future, though.</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="AddCargo">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>138</x>
                <y>65</y>
                <center>
                  <x>143</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>138</xMin>
                <yMin>65</yMin>
                <xMax>148</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <Amount>0</Amount>
            </ButtonAction>
          </Actions>
          <Name>Let's move out!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>954</x>
        <y>772</y>
        <center>
          <x>1087.5</x>
          <y>836.5</y>
        </center>
        <width>267</width>
        <height>129</height>
        <xMin>954</xMin>
        <yMin>772</yMin>
        <xMax>1221</xMax>
        <yMax>901</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"Our sensors indicate no problems regarding your convoy. So your transparant tricks won't work.

I'm afraid that our offensive capabilities surpass your own and we do not wish to take the lives of your crew, so we suggest you leave."
</Text>
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
                <x>255</x>
                <y>65</y>
                <center>
                  <x>260</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>255</xMin>
                <yMin>65</yMin>
                <xMax>265</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>9</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>No can't do, we need those stem bolts!</Name>
        </DialogButton>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="NextDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>255</x>
                <y>109</y>
                <center>
                  <x>260</x>
                  <y>114</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>255</xMin>
                <yMin>109</yMin>
                <xMax>265</xMax>
                <yMax>119</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>15</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Fine, we'll leave.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>973</x>
        <y>951</y>
        <center>
          <x>1070.5</x>
          <y>1002.5</y>
        </center>
        <width>195</width>
        <height>103</height>
        <xMin>973</xMin>
        <yMin>951</yMin>
        <xMax>1168</xMax>
        <yMax>1054</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"We are happy to assist fellow travelers down on their luck in these godforsaken wastelands.

Sit tight, we will be there shortly to offer assistance."</Text>
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
                <x>183</x>
                <y>65</y>
                <center>
                  <x>188</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>183</xMin>
                <yMin>65</yMin>
                <xMax>193</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>6</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
            <ButtonAction xsi:type="NextDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>183</x>
                <y>83</y>
                <center>
                  <x>188</x>
                  <y>88</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>183</xMin>
                <yMin>83</yMin>
                <xMax>193</xMax>
                <yMax>93</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>7</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Prepare to ambush them.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>1375</x>
        <y>850</y>
        <center>
          <x>1472</x>
          <y>900</y>
        </center>
        <width>194</width>
        <height>100</height>
        <xMin>1375</xMin>
        <yMin>850</yMin>
        <xMax>1569</xMax>
        <yMax>950</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Having blown your chance to secure the shipment of Self-sealing stem bolts from the transport, you have no other than to accept the mission the Eiffels' brothers offered you.

Luckily, you have received the details regarding that offer on your communications device.</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="AddObjectiveNode">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>182</x>
                <y>65</y>
                <center>
                  <x>187</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>182</xMin>
                <yMin>65</yMin>
                <xMax>192</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <nodeName>Q_Stembolts_MissionAccept</nodeName>
              <nodeDiscription>You failed to capture the shipment of stem bolts being transferred.

The Eiffels' brothers want you to acquire the deed to a plot of land, however, and will give you the stem bolts if you succeed.</nodeDiscription>
              <pos>Random</pos>
              <distance>0</distance>
            </ButtonAction>
          </Actions>
          <Name>Fine... move out!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>1248</x>
        <y>239</y>
        <center>
          <x>1323</x>
          <y>289</y>
        </center>
        <width>150</width>
        <height>100</height>
        <xMin>1248</xMin>
        <yMin>239</yMin>
        <xMax>1398</xMax>
        <yMax>339</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>You secure an adequate supply of stem bolts from the transport vehicles, they should prove more than enough to patch up your spaceship.

After transporting the stem bolts to your own cargo hold, you get ready to leave.

Let's hope Eiffels Inc. won't find out in the near future.</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="AddCargo">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>138</x>
                <y>65</y>
                <center>
                  <x>143</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>138</xMin>
                <yMin>65</yMin>
                <xMax>148</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <Amount>0</Amount>
            </ButtonAction>
          </Actions>
          <Name>Move out!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
  </Dialogs>
  <Name>Q_Stembolts_AmbushTransport</Name>
</Scenario>