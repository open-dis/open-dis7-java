package edu.nps.moves.dis7.entities.esp.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6850b758;
 * Country: Spain (ESP);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 29488
 */
public class F105CristobalColon extends EntityType
{
    /** Default constructor */
    public F105CristobalColon()
    {
        setCountry(Country.SPAIN_ESP);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 19005, Guided Missile Frigate (FFG)
        setSubCategory((byte)2); // uid 19007, Alvaro De Bazan Class (FFG)
        setSpecific((byte)5); // uid 29488, F105 Cristobal Colon
    }
}
