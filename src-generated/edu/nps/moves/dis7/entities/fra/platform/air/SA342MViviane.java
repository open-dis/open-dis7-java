package edu.nps.moves.dis7.entities.fra.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@ea6147e;
 * Country: France (FRA);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 15824
 */
public class SA342MViviane extends EntityType
{
    /** Default constructor */
    public SA342MViviane()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)20); // uid 15818, Attack Helicopter
        setSubCategory((byte)2); // uid 15822, Eurocopter SA342 Gazelle
        setSpecific((byte)2); // uid 15824, SA 342M Viviane
    }
}
