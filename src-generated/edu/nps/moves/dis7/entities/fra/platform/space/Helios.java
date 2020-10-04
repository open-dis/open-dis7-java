package edu.nps.moves.dis7.entities.fra.platform.space;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6933b6c6
 * Country: France (FRA)
 * Entity kind: Platform
 * Domain: SPACE
 *
 * Entity type uid: 16225
 */
public class Helios extends EntityType
{
    public Helios()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SPACE));

        setCategory((byte)2); // uid 16211, Unmanned
        setSubCategory((byte)7); // uid 16224, Imaging Radar surveillance satellite
        setSpecific((byte)1); // uid 16225, Helios
    }
}
