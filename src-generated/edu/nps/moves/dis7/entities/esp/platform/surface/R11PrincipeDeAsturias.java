package edu.nps.moves.dis7.entities.esp.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6daf7d37;
 * Country: Spain (ESP);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 19004
 */
public class R11PrincipeDeAsturias extends EntityType
{
    /** Default constructor */
    public R11PrincipeDeAsturias()
    {
        setCountry(Country.SPAIN_ESP);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)1); // uid 19002, Carrier
        setSubCategory((byte)1); // uid 19003, Principe De Asturias Class (CVS)
        setSpecific((byte)1); // uid 19004, R11 Principe De Asturias
    }
}
