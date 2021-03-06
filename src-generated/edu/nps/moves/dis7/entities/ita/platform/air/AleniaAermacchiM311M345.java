package edu.nps.moves.dis7.entities.ita.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@1c6804cd;
 * Country: Italy (ITA);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 29173
 */
public class AleniaAermacchiM311M345 extends EntityType
{
    /** Default constructor */
    public AleniaAermacchiM311M345()
    {
        setCountry(Country.ITALY_ITA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)40); // uid 24760, Trainer
        setSubCategory((byte)2); // uid 29173, Alenia Aermacchi M-311/M-345
    }
}
