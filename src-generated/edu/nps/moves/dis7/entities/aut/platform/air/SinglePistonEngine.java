package edu.nps.moves.dis7.entities.aut.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@2f7a2457;
 * Country: Austria (AUT);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 29434
 */
public class SinglePistonEngine extends EntityType
{
    /** Default constructor */
    public SinglePistonEngine()
    {
        setCountry(Country.AUSTRIA_AUT);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)85); // uid 29433, Civilian Fixed Wing Aircraft, Small (up to 12,500 lbs / 5,670 kg)
        setSubCategory((byte)11); // uid 29434, Single Piston Engine
    }
}
