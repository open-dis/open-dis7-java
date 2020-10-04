package edu.nps.moves.dis7.entities.bra.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@6adede5
 * Country: Brazil (BRA)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 31903
 */
public class SupportVessel extends EntityType
{
    public SupportVessel()
    {
        setCountry(Country.BRAZIL_BRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)83); // uid 31903, Support Vessel
    }
}
