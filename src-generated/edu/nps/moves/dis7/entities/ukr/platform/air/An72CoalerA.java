package edu.nps.moves.dis7.entities.ukr.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@3aa41da1;
 * Country: Ukraine (UKR);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 29256
 */
public class An72CoalerA extends EntityType
{
    /** Default constructor */
    public An72CoalerA()
    {
        setCountry(Country.UKRAINE_UKR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)87); // uid 29244, Civilian Fixed Wing Aircraft, Large (up to 255,000 lbs / 115,666 kg)
        setSubCategory((byte)32); // uid 29250, Twin Jet
        setSpecific((byte)2); // uid 29255, Antonov An-72
        setExtra((byte)1); // uid 29256, An-72 Coaler-A
    }
}
