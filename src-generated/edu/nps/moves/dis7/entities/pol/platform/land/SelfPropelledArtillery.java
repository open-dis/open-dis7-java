package edu.nps.moves.dis7.entities.pol.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@33a630fa
 * Country: Poland (POL)
 * Entity kind: Platform
 * Domain: LAND
 *
 * Entity type uid: 32565
 */
public class SelfPropelledArtillery extends EntityType
{
    public SelfPropelledArtillery()
    {
        setCountry(Country.POLAND_POL);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)4); // uid 32565, Self-Propelled Artillery
    }
}
