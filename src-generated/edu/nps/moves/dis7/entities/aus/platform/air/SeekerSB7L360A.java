package edu.nps.moves.dis7.entities.aus.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4ca8195f;
 * Country: Australia (AUS);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 29577
 */
public class SeekerSB7L360A extends EntityType
{
    /** Default constructor */
    public SeekerSB7L360A()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)85); // uid 29575, Civilian Fixed Wing Aircraft, Small (up to 12,500 lbs / 5,670 kg)
        setSubCategory((byte)11); // uid 29576, Single Piston Engine
        setSpecific((byte)1); // uid 29577, Seeker SB7L-360A
    }
}
