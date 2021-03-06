package edu.nps.moves.dis7.entities.bra.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@18be83e4;
 * Country: Brazil (BRA);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 24343
 */
public class EmbraerERJ145 extends EntityType
{
    /** Default constructor */
    public EmbraerERJ145()
    {
        setCountry(Country.BRAZIL_BRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)87); // uid 23890, Civilian Fixed Wing Aircraft, Large (up to 255,000 lbs / 115,666 kg)
        setSubCategory((byte)32); // uid 23891, Twin Jet
        setSpecific((byte)3); // uid 24340, Embraer ERJ 145 Series
        setExtra((byte)3); // uid 24343, Embraer ERJ145
    }
}
