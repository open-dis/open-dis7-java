package edu.nps.moves.dis7.entities.pol.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@1e411d81;
 * Country: Poland (POL);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 24750
 */
public class SinglePistonEngine extends EntityType
{
    /** Default constructor */
    public SinglePistonEngine()
    {
        setCountry(Country.POLAND_POL);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)85); // uid 24749, Civilian Fixed Wing Aircraft, Small (up to 12,500 lbs / 5,670 kg)
        setSubCategory((byte)11); // uid 24750, Single Piston Engine
    }
}
